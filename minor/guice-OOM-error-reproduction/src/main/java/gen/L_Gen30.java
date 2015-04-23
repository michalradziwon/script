
  package gen;
  public class L_Gen30 {
  		@com.google.inject.Inject
  		public L_Gen30(L_Gen31 l_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  