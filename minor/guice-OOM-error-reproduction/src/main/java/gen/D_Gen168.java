
  package gen;
  public class D_Gen168 {
  		@com.google.inject.Inject
  		public D_Gen168(D_Gen169 d_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  