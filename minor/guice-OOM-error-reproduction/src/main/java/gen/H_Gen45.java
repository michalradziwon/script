
  package gen;
  public class H_Gen45 {
  		@com.google.inject.Inject
  		public H_Gen45(H_Gen46 h_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  