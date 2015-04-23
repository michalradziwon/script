
  package gen;
  public class Q_Gen189 {
  		@com.google.inject.Inject
  		public Q_Gen189(Q_Gen190 q_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  