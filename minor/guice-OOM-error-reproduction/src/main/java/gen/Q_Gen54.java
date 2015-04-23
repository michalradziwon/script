
  package gen;
  public class Q_Gen54 {
  		@com.google.inject.Inject
  		public Q_Gen54(Q_Gen55 q_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  