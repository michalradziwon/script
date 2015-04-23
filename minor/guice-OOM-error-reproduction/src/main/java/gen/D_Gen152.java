
  package gen;
  public class D_Gen152 {
  		@com.google.inject.Inject
  		public D_Gen152(D_Gen153 d_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  