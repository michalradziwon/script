
  package gen;
  public class P_Gen13 {
  		@com.google.inject.Inject
  		public P_Gen13(P_Gen14 p_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  