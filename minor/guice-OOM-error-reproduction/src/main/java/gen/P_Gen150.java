
  package gen;
  public class P_Gen150 {
  		@com.google.inject.Inject
  		public P_Gen150(P_Gen151 p_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  