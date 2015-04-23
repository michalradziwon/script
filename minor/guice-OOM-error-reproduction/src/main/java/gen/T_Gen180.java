
  package gen;
  public class T_Gen180 {
  		@com.google.inject.Inject
  		public T_Gen180(T_Gen181 t_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  