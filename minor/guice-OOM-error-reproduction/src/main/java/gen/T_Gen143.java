
  package gen;
  public class T_Gen143 {
  		@com.google.inject.Inject
  		public T_Gen143(T_Gen144 t_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  