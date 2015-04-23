
  package gen;
  public class T_Gen32 {
  		@com.google.inject.Inject
  		public T_Gen32(T_Gen33 t_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  