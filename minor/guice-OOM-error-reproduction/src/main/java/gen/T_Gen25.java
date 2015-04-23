
  package gen;
  public class T_Gen25 {
  		@com.google.inject.Inject
  		public T_Gen25(T_Gen26 t_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  