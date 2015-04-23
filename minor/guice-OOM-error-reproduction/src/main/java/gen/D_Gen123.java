
  package gen;
  public class D_Gen123 {
  		@com.google.inject.Inject
  		public D_Gen123(D_Gen124 d_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  