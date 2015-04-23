
  package gen;
  public class D_Gen81 {
  		@com.google.inject.Inject
  		public D_Gen81(D_Gen82 d_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  