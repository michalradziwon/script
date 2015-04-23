
  package gen;
  public class L_Gen54 {
  		@com.google.inject.Inject
  		public L_Gen54(L_Gen55 l_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  