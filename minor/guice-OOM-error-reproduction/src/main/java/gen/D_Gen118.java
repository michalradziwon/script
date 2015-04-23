
  package gen;
  public class D_Gen118 {
  		@com.google.inject.Inject
  		public D_Gen118(D_Gen119 d_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  