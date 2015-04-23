
  package gen;
  public class L_Gen173 {
  		@com.google.inject.Inject
  		public L_Gen173(L_Gen174 l_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  