
  package gen;
  public class L_Gen38 {
  		@com.google.inject.Inject
  		public L_Gen38(L_Gen39 l_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  