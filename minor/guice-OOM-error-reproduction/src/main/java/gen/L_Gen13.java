
  package gen;
  public class L_Gen13 {
  		@com.google.inject.Inject
  		public L_Gen13(L_Gen14 l_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  