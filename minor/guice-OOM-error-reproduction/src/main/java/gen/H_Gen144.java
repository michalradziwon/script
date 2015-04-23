
  package gen;
  public class H_Gen144 {
  		@com.google.inject.Inject
  		public H_Gen144(H_Gen145 h_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  