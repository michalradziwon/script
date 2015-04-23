
  package gen;
  public class F_Gen118 {
  		@com.google.inject.Inject
  		public F_Gen118(F_Gen119 f_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  