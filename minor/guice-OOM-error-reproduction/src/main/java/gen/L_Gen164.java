
  package gen;
  public class L_Gen164 {
  		@com.google.inject.Inject
  		public L_Gen164(L_Gen165 l_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  