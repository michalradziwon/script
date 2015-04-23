
  package gen;
  public class D_Gen33 {
  		@com.google.inject.Inject
  		public D_Gen33(D_Gen34 d_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  