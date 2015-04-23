
  package gen;
  public class J_Gen45 {
  		@com.google.inject.Inject
  		public J_Gen45(J_Gen46 j_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  