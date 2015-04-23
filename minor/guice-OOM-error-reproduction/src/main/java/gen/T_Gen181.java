
  package gen;
  public class T_Gen181 {
  		@com.google.inject.Inject
  		public T_Gen181(T_Gen182 t_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  