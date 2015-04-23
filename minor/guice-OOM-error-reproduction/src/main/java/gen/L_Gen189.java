
  package gen;
  public class L_Gen189 {
  		@com.google.inject.Inject
  		public L_Gen189(L_Gen190 l_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  