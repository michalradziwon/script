
  package gen;
  public class D_Gen43 {
  		@com.google.inject.Inject
  		public D_Gen43(D_Gen44 d_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  