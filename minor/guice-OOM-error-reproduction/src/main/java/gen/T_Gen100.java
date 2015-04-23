
  package gen;
  public class T_Gen100 {
  		@com.google.inject.Inject
  		public T_Gen100(T_Gen101 t_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  