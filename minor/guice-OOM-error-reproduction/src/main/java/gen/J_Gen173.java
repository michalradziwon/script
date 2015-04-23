
  package gen;
  public class J_Gen173 {
  		@com.google.inject.Inject
  		public J_Gen173(J_Gen174 j_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  