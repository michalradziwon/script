
  package gen;
  public class J_Gen18 {
  		@com.google.inject.Inject
  		public J_Gen18(J_Gen19 j_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  