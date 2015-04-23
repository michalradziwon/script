
  package gen;
  public class L_Gen44 {
  		@com.google.inject.Inject
  		public L_Gen44(L_Gen45 l_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  