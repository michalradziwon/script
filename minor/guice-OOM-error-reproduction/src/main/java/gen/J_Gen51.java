
  package gen;
  public class J_Gen51 {
  		@com.google.inject.Inject
  		public J_Gen51(J_Gen52 j_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  