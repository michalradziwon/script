
  package gen;
  public class J_Gen166 {
  		@com.google.inject.Inject
  		public J_Gen166(J_Gen167 j_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  