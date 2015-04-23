
  package gen;
  public class J_Gen146 {
  		@com.google.inject.Inject
  		public J_Gen146(J_Gen147 j_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  