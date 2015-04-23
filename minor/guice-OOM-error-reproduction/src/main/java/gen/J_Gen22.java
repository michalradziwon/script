
  package gen;
  public class J_Gen22 {
  		@com.google.inject.Inject
  		public J_Gen22(J_Gen23 j_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  