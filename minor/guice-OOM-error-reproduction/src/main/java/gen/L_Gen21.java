
  package gen;
  public class L_Gen21 {
  		@com.google.inject.Inject
  		public L_Gen21(L_Gen22 l_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  