
  package gen;
  public class D_Gen72 {
  		@com.google.inject.Inject
  		public D_Gen72(D_Gen73 d_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  