
  package gen;
  public class T_Gen54 {
  		@com.google.inject.Inject
  		public T_Gen54(T_Gen55 t_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  