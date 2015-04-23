
  package gen;
  public class F_Gen103 {
  		@com.google.inject.Inject
  		public F_Gen103(F_Gen104 f_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  