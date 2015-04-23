
  package gen;
  public class J_Gen84 {
  		@com.google.inject.Inject
  		public J_Gen84(J_Gen85 j_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  