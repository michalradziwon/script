
  package gen;
  public class P_Gen54 {
  		@com.google.inject.Inject
  		public P_Gen54(P_Gen55 p_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  