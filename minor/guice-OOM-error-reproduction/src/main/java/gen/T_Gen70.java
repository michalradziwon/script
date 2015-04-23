
  package gen;
  public class T_Gen70 {
  		@com.google.inject.Inject
  		public T_Gen70(T_Gen71 t_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  