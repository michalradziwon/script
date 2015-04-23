
  package gen;
  public class L_Gen48 {
  		@com.google.inject.Inject
  		public L_Gen48(L_Gen49 l_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  