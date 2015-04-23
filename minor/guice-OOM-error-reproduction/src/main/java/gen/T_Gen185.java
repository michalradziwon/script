
  package gen;
  public class T_Gen185 {
  		@com.google.inject.Inject
  		public T_Gen185(T_Gen186 t_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  