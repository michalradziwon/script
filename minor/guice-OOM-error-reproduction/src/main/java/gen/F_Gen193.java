
  package gen;
  public class F_Gen193 {
  		@com.google.inject.Inject
  		public F_Gen193(F_Gen194 f_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  