
  package gen;
  public class L_Gen158 {
  		@com.google.inject.Inject
  		public L_Gen158(L_Gen159 l_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  