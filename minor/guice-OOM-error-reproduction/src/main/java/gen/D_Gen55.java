
  package gen;
  public class D_Gen55 {
  		@com.google.inject.Inject
  		public D_Gen55(D_Gen56 d_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  