
  package gen;
  public class T_Gen58 {
  		@com.google.inject.Inject
  		public T_Gen58(T_Gen59 t_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  