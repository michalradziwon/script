
  package gen;
  public class F_Gen3 {
  		@com.google.inject.Inject
  		public F_Gen3(F_Gen4 f_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  