
  package gen;
  public class J_Gen153 {
  		@com.google.inject.Inject
  		public J_Gen153(J_Gen154 j_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  