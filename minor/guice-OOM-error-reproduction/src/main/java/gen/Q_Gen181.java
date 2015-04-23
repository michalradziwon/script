
  package gen;
  public class Q_Gen181 {
  		@com.google.inject.Inject
  		public Q_Gen181(Q_Gen182 q_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  