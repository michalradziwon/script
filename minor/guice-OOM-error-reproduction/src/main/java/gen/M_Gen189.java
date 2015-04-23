
  package gen;
  public class M_Gen189 {
  		@com.google.inject.Inject
  		public M_Gen189(M_Gen190 m_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  