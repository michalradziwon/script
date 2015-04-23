
  package gen;
  public class D_Gen3 {
  		@com.google.inject.Inject
  		public D_Gen3(D_Gen4 d_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  