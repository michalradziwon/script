
  package gen;
  public class T_Gen28 {
  		@com.google.inject.Inject
  		public T_Gen28(T_Gen29 t_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  