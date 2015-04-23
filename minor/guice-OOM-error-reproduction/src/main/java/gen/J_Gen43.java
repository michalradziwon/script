
  package gen;
  public class J_Gen43 {
  		@com.google.inject.Inject
  		public J_Gen43(J_Gen44 j_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  